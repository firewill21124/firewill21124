// one peice-1,2 clerly mentioned in insta reels
// one peice-3
class HelloWorld {
    public static void main(String[] args) {
        int start=0;
        int end=10;
        int offset=1;
        for(int i=start;i<=end;i+=offset){
            System.out.println(i); //print statement to display content in new line
        }
    }
}

// explination
// Here we declared 3 cariables of integer data type and started for loop, for loop will take 3 arguments they are start value, end value and offset value 

// offset value refers to the skip value
// example:
// start=1
// end=10
// offset=5

// so output will be:
// 1
// 6

// One Piece-4
class HelloWorld {
    public static void main(String[] args) {
        int start=0;
        int end=10;
        int offset=1;
        for(start<=end){
            System.out.println(start); //print statement to display content in new line
            start+=offset;
        }
    }
}

// it is same as for loop but with experience we will know where to use while loop and for loop
