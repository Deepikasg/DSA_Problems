#include <stdio.h>
void add(int a,int b){
    while(b!=0){
        int temp=(a&b)<<1;
        a=a^b;
        b=temp;
    }
    printf("%d",a);
}
int main() {
    // Write C code here
    int a,b;
    printf("Enter 2 numbers:\n");
    scanf("%d",&a);
    scanf("%d",&b);
    add(a,b);
    return 0;
}
