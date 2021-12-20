let game, players, p1, p2;

function setup() {
  p1 = new Robot(40, 200, "#303030", [87, 83, 65, 68], { x: 400, y: 400 });
  p2 = new Robot(
    320,
    200,
    "#30ff2d",
    [UP_ARROW, DOWN_ARROW, LEFT_ARROW, RIGHT_ARROW],
    { x: 400, y: 400 }
  );
  players = [p1, p2];
  game = new Game(players, 5);

  createCanvas(400, 400);
  background(200);
}

function draw() {
    let gameOver = game.run();

    if(!gameOver){
        players.forEach((player) => {
            player.draw();
            player.move();
          });
    }
}
