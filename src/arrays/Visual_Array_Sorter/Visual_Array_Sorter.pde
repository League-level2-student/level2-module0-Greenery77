import java.util.Random;
  
//1. create an array of ints. don't initialize it yet.

int[] i;

void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.

size(400, 400);

  //3. initialize your array with the built in width variable
  
  i = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable

Random ran = new Random();

for (int j = 0; j < i.length; j++) {
 
  i[j] = ran.nextInt(height);
  
}

  //5. call the noStroke() method

noStroke();

}

void draw() {
  //6. set the background color with background(r, g, b);

background(0, 0, 0);

  //7. set the color for your graph

fill(250, 250,2501);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the current index in the array
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array

for (int k = 0; k < i.length; k++) {
 
  rect(k, height, 1, -i[k]);
  
}

  //9. call the stepSort method

stepSort(i);

  //10. extract the code that randomizes the array into a method.

  //11. call the method you made in step 10 when the mouse is pressed
  
  if (mousePressed) {
   
    randomize();
    
  }

}

void randomize(){

Random ran = new Random();

for (int j = 0; j < i.length; j++) {
 
  i[j] = ran.nextInt(height);
  
}

}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
