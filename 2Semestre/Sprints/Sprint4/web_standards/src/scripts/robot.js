class Robot {
  constructor(x, y, color, movement, canvasSize) {
    this.x = x;
    this.y = y;
    this.color = color;
    this.movement = movement;
    this.canvasSize = canvasSize;

    this.speed = 5;
    this.size = 40;
    this.health = 100;
  }

  draw() {
    fill(this.color);
    noStroke();
    square(this.x, this.y, this.size);
  }

  move() {
    if (keyIsDown(this.movement[0]) && this.y >= this.speed) {
        this.y -= this.speed;
    } else if (keyIsDown(this.movement[1]) && this.y <= this.canvasSize.y - this.size - this.speed) {
        this.y += this.speed;
    } else if (keyIsDown(this.movement[2]) && this.x >= this.speed) {
        this.x -= this.speed;
    } else if (keyIsDown(this.movement[3]) && this.x <= this.canvasSize.x - this.size - this.speed) {
        this.x += this.speed;
    }
  }

  takeDamage() {
    return (this.health -= Math.floor(Math.random() * 21));
  }
}
