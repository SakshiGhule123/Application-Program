#include<stdio.h> //printf,scanf
#include<stdlib.h> //malloc ,free

typedef struct Node  //making node ,12 byte
{
    int no;
    struct Node *next;
}NODE, *PNODE, **PPNODE;

int main()
{
    PNODE First = NULL;

    return 0;
}