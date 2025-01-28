#include <stdio.h> 
#include <stdlib.h> 
#include <string.h> 
struct Job 
{ 
    int id;
    char user[50];
    struct Job* next;
};
struct Job* front = NULL;
struct Job* rear = NULL;
void addJob() 
{ 
    int id;
    char user[50];
    printf("Enter job ID: ");
    scanf("%d", &id);
    printf("Enter user name: ");
    scanf("%s", user);
    struct Job* newJob = (struct Job*)malloc(sizeof(struct Job));
    newJob->id = id;
    strcpy(newJob->user, user);
    newJob->next = NULL;
    if (rear == NULL) 
        front = rear = newJob; 
    else 
    { 
        rear->next = newJob;
        rear = newJob;
    } 
    printf("Added: Job ID: %d, User: %s\n", id, user);
} 
void processJob() 
{ 
    if (front == NULL) 
    { 
        printf("No jobs in the queue\n");
        return;
    } 
    struct Job* temp = front;
    printf("Processing: Job ID: %d, User: %s\n", temp->id, temp->user);
    front = front->next;
    if (front == NULL) 
        rear = NULL;
    free(temp);
} 
void displayQueue() 
{ 
    struct Job* temp = front;
    printf("Current Queue:\n");
    while (temp != NULL) 
    { 
        printf("Job ID: %d, User: %s\n", temp->id, temp->user);
        temp = temp->next;
    } 
    if (front == NULL) 
        printf("Queue is empty.\n");
}
int main() 
{ 
    int choice, id;
    char user[50];
    while (1) 
    { 
        printf("\nMenu:\n");
        printf("1. Add Print Job\n");
        printf("2. Process Print Job\n");
        printf("3. Display Print Queue\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) 
        { 
            case 1: 
                addJob();
                break;
            case 2: 
                processJob();
                break;
            case 3: 
                displayQueue();
                break;
            case 4: 
                printf("Exiting...\n");
                exit(0);
            default: 
                printf("Invalid choice!\n");
        } 
    } 
    return 0;
}