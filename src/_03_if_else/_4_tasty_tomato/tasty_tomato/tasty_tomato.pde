void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill (225,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (0,225,0);
    rect(176, 103, 12, 32);
    fill(200,200,200);
    if (mousePressed){
    ellipse(75,205,25,25);
    }
}
