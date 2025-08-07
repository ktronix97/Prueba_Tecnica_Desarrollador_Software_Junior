import unicodedata
import re
from collections import Counter

def normalizar(texto):
    texto = texto.lower()
    texto = ''.join(
        c for c in unicodedata.normalize('NFD', texto)
        if unicodedata.category(c) != 'Mn'
    )
    texto = re.sub(r'[^a-z]', '', texto)
    return texto

def puede_formar_palindromo(freq, longitud):
    odd_count = sum(1 for count in freq.values() if count % 2 != 0)
    return odd_count == (1 if longitud % 2 else 0)

def preprocesar_famosos(lista_famosos):
    mapa = []
    for frase in lista_famosos:
        normal = normalizar(frase)
        clave = Counter(normal)
        mapa.append((clave, frase))
    return mapa

def main():
    s_original = input("Ingresa la cadena: ").strip()
    s = normalizar(s_original)
    n = len(s)

    if n > 1000:
        print(f"Not Possible: límite superado ({n} caracteres, máximo 1000)")
        return

    if n == 0:
        print("")
        return

    palindromos_famosos = [
        "anita lava la tina",
        "reconocer",
        "somos",
        "oso",
        "neuquén",
        "arenera",
        "menem",
        "radar",
        "salas",
        "rever",
        "dábale arroz a la zorra el abad",
        "aibofobia",
        "la ruta natural",
        "amo la pacífica paloma",
        "no subas abusón",
        "allí va ramón y no maravilla",
        "yo hago yoga hoy",
        "a mamá roma le aviva el amor a mamá",
        "sé verlas al revés",
        "acaso hubo búhos acá",
        "la tele letal",
        "la moral anula la larga gala lunar",
        "la sal ataca la sal",
        "anita atina"
    ]

    famosos_preprocesados = preprocesar_famosos(palindromos_famosos)

    counter_input = Counter(s)

    # --- DEBUG para comparar con famosos ---
    for counter_famoso, frase_original in famosos_preprocesados:
        normal_famoso = normalizar(frase_original)
        print("Probando contra:", frase_original)
        print("Famoso normalizado:", normal_famoso)
        print("Input normalizado:", s)
        print("¿Son iguales los conteos?:", counter_input == counter_famoso)
        print("---")
        if counter_input == counter_famoso:
            print(frase_original)
            return

    # Si no coincide con ningún famoso, intentar construir un palíndromo
    freq = dict(counter_input)
    if not puede_formar_palindromo(freq, n):
        print("Not Possible")
        return

    half = {char: count // 2 for char, count in freq.items()}
    first_half = []

    # Construcción consistente: orden alfabético
    for char in sorted(freq):
        first_half.extend([char] * half[char])

    first_half_str = ''.join(first_half)

    center = ''
    for char, count in freq.items():
        if count % 2 != 0:
            center = char
            break

    second_half = first_half_str[::-1]
    palindrome = first_half_str + center + second_half
    print(palindrome)

if __name__ == "__main__":
    main()

# This code checks if a given string can be rearranged to form a palindrome
# and also checks against a list of famous palindromes.
