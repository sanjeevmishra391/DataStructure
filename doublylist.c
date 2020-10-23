#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node*next;
	struct node*prev;
};
struct node*head=NULL;
struct node*createnode(int x)
{
	struct node*newnode=(struct node*)malloc(sizeof(struct node));
	newnode->data=x;
	newnode->next=NULL;
	newnode->prev=NULL;
}
void insertatbeg(int x)
{
	struct node*newnode=createnode(x);
	if(head==NULL)
	{
		head=newnode;
		return;
	}
	else{
		newnode->next=head;
	head=newnode;
	newnode->prev=NULL;
	newnode->next->prev=newnode;
	}
	
}
void delatbeg()
{
	struct node*temp=head;
	head=temp->next;
	head->next->prev=NULL;
	free(temp);
}
void print()
{
	struct node*temp=head;
	while(temp!=NULL)
	{
		printf("%d ",temp->data);
		temp=temp->next;
	}
}
void insertatpos(int x,int pos)
{
	int i=0;
	struct node*temp=head,*prev1=NULL;
	struct node *nptr=createnode(x);
	while(i<pos)
	{
		prev1=temp;
		temp=temp->next;
		i++;
	}
	nptr->next=temp;
	prev1->next=nptr;
	nptr->prev=prev1;
	temp->prev=nptr;
}
main()
{
	insertatbeg(1);
	insertatbeg(3);
	insertatbeg(7);
	insertatbeg(5);	
	print();
	printf("\n");
	insertatpos(4,2);
	print();
	printf("\n");
	insertatpos(8,1);
	print();
}