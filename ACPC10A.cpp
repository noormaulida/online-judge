#include <stdio.h>
#include <math.h>

int main() {
	int arr[4];
	long temp=0;
	
	while(1) {
		scanf("%d %d %d", &arr[0], &arr[1], &arr[2]);
		
		
		if((arr[0]==0) && (arr[1]==0) && (arr[1]==0))
		break;
		
		else if((double((double)arr[1])/((double)arr[0]) == ((double)((double)arr[2])/((double)arr[1])))) {
			temp= arr[2] * (arr[1])/(arr[0]);
			printf("GP %d", temp);
			}
		 
		 else if((arr[1]-arr[0]) == (arr[2]-arr[1])) {
			temp= arr[2] + (arr[1])-(arr[0]);
			printf("AP %d", temp);
			}

	printf("\n");

		}

return 0;
	
	}
