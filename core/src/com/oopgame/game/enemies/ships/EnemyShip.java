package com.oopgame.game.enemies.ships;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.oopgame.game.Hittable;

public interface EnemyShip extends Hittable{
    // see meetod tuleks asendada äkki kahe eraldi meetodiga:
    // ühega saab määrata boosteri powerit ja teisega saab määrata liikumise suunda
    void movement(Vector2 movementVector);

    void update();

    void draw(SpriteBatch batch);

    void shoot(float angle);

    void deactivate();

    void reset(Vector2 spawn);
}