//Napisz program, który znajdzie liczby całkowite podzielne przez X (bez reszty) z zakresu od A do B.
//Kluczowy algorytm zamknij w osobnej funkcji/metodzie, która będzie przyjmowała 3 argumenty wejściowe.
//Funkcja ta nie powinna wypisać niczego na ekran. Zamiast tego powinna zwracać kolekcję znalezionych
//elementów w taki sposób, żeby można było ich użyć (odwołać się do nich) w innych częściach programu.
package com.kodilla.division;

import java.util.HashSet;
import java.util.Set;

public class AdditionalTaskForDivision {
    public static Set<Integer> getDividends(int divisor, int minRange, int maxRange) {
        Set<Integer> dividends = new HashSet<>();

        for (int i = minRange; i <= maxRange; i++) {
            if (i % divisor == 0) {
                dividends.add(i);
            }
        }
        return dividends;
    }
}
