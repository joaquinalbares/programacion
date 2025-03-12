public static boolean esNumeroEspecial(int numero) {
int suma = 0;

    // Bucle para sumar los dígitos del número
    int temp = numero;
    while (temp > 0) {
        suma += temp % 10;
        temp /= 10;
    }
    
    // Primera condición anidada
    if (suma % 2 == 0) {
        if (numero % 3 == 0) {
            return true; 
    } else {
        if (numero % 5 == 0) {
            return true; 
    }
    return false;
}
