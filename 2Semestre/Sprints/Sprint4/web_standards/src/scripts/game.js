class Game {
  constructor(players, maxCollisions) {
    this.p = players;
    this.mC = maxCollisions;
    this.collisions = 0;
    this.isColliding = false;
    this.gameOver = false;
  }

  enforceRules() {
    if (this.collisions == 5) {
      this.win();
      this.gameOver = true;
    }
  }

  detectCollisions() {
    if (
      this.p[0].x < this.p[1].x + this.p[1].size &&
      this.p[0].x + this.p[0].size > this.p[1].x &&
      this.p[0].y < this.p[1].y + this.p[1].size &&
      this.p[0].y + this.p[0].size > this.p[1].y
    ) {
      if (this.isColliding == false) {
        console.log("collided");
        this.isColliding = true;
        this.collisions++;
        this.p.forEach((player) => {
          player.takeDamage();
        });
        this.enforceRules();
      }
    } else {
      this.isColliding = false;
    }
  }

  draw() {
    background(200);
    text(`Player 1 health : ${this.p[0].health}`, 10, 10);
    text(`Player 2 health : ${this.p[1].health}`, 10, 30);
  }

  win() {
    textAlign(CENTER, CENTER);
    if (this.p[0].health > this.p[1].health) {
      text(`Player One Won!`, width / 2, height / 2);
    } else if (this.p[0].health < this.p[1].health) {
      text(`Player Two Won!`, width / 2, height / 2);
    } else {
      text(`Draw!`, width / 2, height / 2);
    }
  }

  run(callbacks) {
    if (!this.gameOver) {
      this.draw();
      this.detectCollisions();
      return false;
    }
    return true;
  }
}
