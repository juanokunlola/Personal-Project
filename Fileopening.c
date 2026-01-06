#include <stdio.h>
//Juan Okunlola - 1002180771
int main(void) {
    char input_filename[100], output_filename[100];
    char buffer[1000]; 
    FILE *IFH, *OFH;
    
    printf("Enter the filename to open for reading : ");
    scanf("%s", input_filename);
    
    printf("Enter the filename to open for writing : ");
    scanf("%s", output_filename);
    
    IFH = fopen(input_filename, "r+");
    
    if (IFH == NULL) {
        printf("Can not open file\n");
        return 1;
    } else {
        printf("File opened successfully\n");
    }
    
    OFH = fopen(output_filename, "w+");
    
    if (OFH == NULL) {
        printf("Cannot open output file for writing\n");
        fclose(IFH); 
        return 1;
    }
    
    while (fgets(buffer, sizeof(buffer), IFH) != NULL) {
        printf("%s", buffer); 
        fprintf(OFH, "%s", buffer); 
    }
    
    fclose(IFH);
    fclose(OFH);
    
    return 0;
}
