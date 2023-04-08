
void setup() {
    size (600,600);
    pepperoni = loadImage ("pepperoni.png");
    olive = loadImage ("olive.png");
    mushroom = loadImage ("mushroom.png");
}
void draw() {
  noStroke();
   fill (250,229,121);
   ellipse (300,300,400,400);
   fill (250,0,0);
   ellipse (300,300,350,350);
   fill (255,255,0);
   ellipse (300,300,335,335);
   image (pepperoni,300,300);
   olive.resize(40,40);
   image (olive,200,300);
   image (pepperoni,150,210);
   image (mushroom,250,250);
}
PImage pepperoni;
PImage olive;
PImage mushroom;
