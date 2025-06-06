

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private Chicken chickens;
    private Background background;
    private List<Cloud> cloud;
    private List<Cat> cats;
    private List<Target> targets;
    private List<TargetSmall> targetsSmall;
    private boolean ingame;
    private final int ICRAFT_X = 390;
    private final int ICRAFT_Y = 60;
    private final int B_WIDTH = 900;
    private final int B_HEIGHT = 900;
    private final int DELAY = 15;
    public static int puan = 0;
    public static int level = 1;

    private final int[][] pos = {{170, 30}, {600, 70}, {250, 10}, {700, 0}, {200, 600}, {300, 500}};

    private final int[][] posTargets = {{20, 10}, {770, 140}, {770, 400}
/*,{20,270}, {770,270}*/
    };

    private final int[][] posTargetsSmall = {{30, 150}, {780, 20}, {30, 410}
/*{780,540}, {30,540}*/
    };

    private final int[][] posClouds = {{250, 10}, {700, 0}, {200, 600}, {300, 500}};

    public Board() {
        initBoard();
        initBackground();
        initCloud();
    }

    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(new Color(133, 219, 235));
        ingame = true;

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        chickens = new Chicken(ICRAFT_X, ICRAFT_Y);
        initCats();
        initTargets();
        initTargetsSmall();
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void initBackground() {
        background = new Background(B_HEIGHT, B_WIDTH);
    }

    public void initCloud() {
        cloud = new ArrayList<>();

        for (int[] p : posClouds) {
            cloud.add(new Cloud(p[0], p[1]));
        }
    }

    public void initTargets() {
        targets = new ArrayList<>();

        for (int[] pt : posTargets) {
            targets.add(new Target(pt[0], pt[1]));
        }
    }

    public void initTargetsSmall() {
        targetsSmall = new ArrayList<>();

        for (int[] pts : posTargetsSmall) {
            targetsSmall.add(new TargetSmall(pts[0], pts[1]));
        }
    }

    public void initCats() {

        cats = new ArrayList<>();

        for (int[] p : pos) {
            cats.add(new Cat(p[0], p[1]));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (ingame) {

            drawObjects(g);
        } else if (!ingame) {

            drawGameOver(g);
        }

        if (puan < 0 && (!ingame)) {

            drawGameOver2(g);
            ingame = false;
        }
    }

    private void drawObjects(Graphics g) {

        background.visible = true;
        if (background.isVisible()) {
            g.drawImage(background.getImage(), 0, 0, this);
        }

        for (Cloud clouds : cloud) {
            clouds.visible = true;
            if (clouds.isVisible()) {
                g.drawImage(clouds.getImage(), clouds.getX(),
                        clouds.getY(), this);
            }
        }
        if (chickens.isVisible()) {
            g.drawImage(chickens.getImage(), chickens.getX(), chickens.getY(), this);
        }

        List<Egg> ms = chickens.getEggs();

        for (Egg egg : ms) {
            if (egg.isVisible()) {
                g.drawImage(egg.getImage(), egg.getX(),
                        egg.getY(), this);
            }
        }

        for (Cat cat : cats) {
            if (cat.isVisible()) {
                g.drawImage(cat.getImage(), cat.getX(), cat.getY(), this);
            }
        }

        for (Target target : targets) {
            if (target.isVisible()) {
                g.drawImage(target.getImage(), target.getX(), target.getY(), this);
            }
        }

        for (TargetSmall targetSmall : targetsSmall) {
            if (targetSmall.isVisible()) {
                g.drawImage(targetSmall.getImage(), targetSmall.getX(), targetSmall.getY(), this);
            }
        }

        g.setColor(Color.WHITE);
        g.drawString("Score: " + puan, 5, 15);
        g.setColor(Color.WHITE);
        g.drawString("Level: " + level, 830, 15);

    }

    private void drawGameOver(Graphics g) {

        String msg = "Game Over!";
        Font small = new Font("Helvetica", Font.BOLD, 30);
        FontMetrics fm = getFontMetrics(small);

        /*
        String msg2 = "Cat ate you!";
        Font small2 = new Font("Helvetica", Font.BOLD, 25);
        FontMetrics fm2 = getFontMetrics(small2);
         */
        
        g.setColor(Color.BLACK);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - fm.stringWidth(msg)) / 2,
                B_HEIGHT / 2 - 150);

        /*
        g.setColor(Color.BLACK);
        g.setFont(small2);
        g.drawString(msg2, (B_WIDTH - fm2.stringWidth(msg2)) / 2,
                B_HEIGHT / 2 - 120);
         */
    }

    private void drawGameOver2(Graphics g) {
        
        /*
        String msg = "Game Over!";
        Font small = new Font("Helvetica", Font.BOLD, 30);
        FontMetrics fm = getFontMetrics(small);
        */
        
        String msg2 = "You've lost all of your points...";
        Font small2 = new Font("Helvetica", Font.BOLD, 25);
        FontMetrics fm2 = getFontMetrics(small2);

        /*
        g.setColor(Color.BLACK);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - fm.stringWidth(msg)) / 2,
                B_HEIGHT / 2 - 150);
        */
        
        g.setColor(Color.BLACK);
        g.setFont(small2);
        g.drawString(msg2, (B_WIDTH - fm2.stringWidth(msg2)) / 2,
                B_HEIGHT / 2 - 120);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        inGame();

        updateClouds();
        updateChickens();
        updateEggs();
        updateCats();
        updateTargets();
        updateTargetsSmall();

        checkCollisions();

        repaint();
    }

    private void inGame() {

        if (!ingame) {
            timer.stop();
        }
    }

    private void updateClouds() {
        for (int i = 0; i < cloud.size(); i++) {

            Cloud a = cloud.get(i);
            a.visible = true;
            if (a.isVisible()) {
                a.move();
            } else {
                cloud.remove(i);
            }
        }
    }

    private void updateChickens() {

        if (chickens.isVisible()) {
            chickens.move();
        }
    }

    private void updateEggs() {

        List<Egg> ms = chickens.getEggs();

        for (int i = 0; i < ms.size(); i++) {

            Egg m = ms.get(i);

            if (m.isVisible()) {
                m.move();
            } else {
                ms.remove(i);
            }
        }
    }

    private void updateCats() {

        for (int i = 0; i < cats.size(); i++) {

            Cat a = cats.get(i);

            if (a.isVisible()) {
                a.move();
            } else {
                cats.remove(i);
            }
        }
    }

    private void updateTargets() {

        for (int i = 0; i < targets.size(); i++) {

            Target a = targets.get(i);

            if (a.isVisible()) {
                a.move();
            } else {
                targets.remove(i);
            }
        }
    }

    private void updateTargetsSmall() {

        for (int i = 0; i < targetsSmall.size(); i++) {

            TargetSmall a = targetsSmall.get(i);

            if (a.isVisible()) {
                a.move();
            } else {
                targetsSmall.remove(i);
            }
        }
    }

    public void checkCollisions() {

        Rectangle r3 = chickens.getBounds();

        for (Cat cat : cats) {

            Rectangle r2 = cat.getBounds();

            if (r3.intersects(r2)) {

                chickens.setVisible(false);
                cat.setVisible(false);
                ingame = false;
            }
        }

        List<Egg> ms = chickens.getEggs();

        for (Egg m : ms) {

            Rectangle r1 = m.getBounds();

            for (Target target : targets) {

                Rectangle r2 = target.getBounds();

                if (r1.intersects(r2)) {
                    m.setVisible(false);
                    target.setVisible(true);
                    puan += 10;
                }
            }

        }

        for (Egg m : ms) {

            Rectangle r1 = m.getBounds();

            for (TargetSmall targetSmall : targetsSmall) {

                Rectangle r2 = targetSmall.getBounds();

                if (r1.intersects(r2)) {

                    m.setVisible(false);
                    targetSmall.setVisible(true);
                    puan += 50;
                }
            }
        }

        if (puan > 1000) {
            level = 2;
            for (Egg m : ms) {

                Rectangle r1 = m.getBounds();

                for (Cat cat : cats) {

                    Rectangle r2 = cat.getBounds();

                    if (r1.intersects(r2)) {

                        m.setVisible(false);
                        cat.setVisible(true);
                        puan -= 100;
                    }
                }
            }
        } else if (puan > 2000) {
            level = 3;
            for (Egg m : ms) {

                Rectangle r1 = m.getBounds();

                for (Cat cat : cats) {

                    Rectangle r2 = cat.getBounds();

                    if (r1.intersects(r2)) {

                        m.setVisible(false);
                        cat.setVisible(true);
                        puan -= 400;
                    }
                }
            }
        }
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            chickens.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            chickens.keyPressed(e);
        }
    }
}
