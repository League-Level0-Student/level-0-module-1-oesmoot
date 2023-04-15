PImage face;
void setup() {
face = loadImage("face.jpeg");
size (500,700);
face.resize (500,700);
image (face, 0, 0);
}
void draw() {
  fill (205,35,245);
ellipse (200,275,50,50);
ellipse (315,275,50,50);
noStroke();
fill(255,255,255);
rect (500,700,-300,-50);
}
