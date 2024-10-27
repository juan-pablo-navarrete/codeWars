package com.relampamigos.codeWars;
/*En tu clase hubo un examen y lo aprobaste. ¡Felicidades!

Pero eres una persona ambiciosa. Quieres saber si eres mejor que el estudiante promedio de tu clase.

Recibirás una matriz con las puntuaciones de los exámenes de tus compañeros. ¡Ahora calcula el promedio y compara tu puntuación!

Vuelve truesi estás mejor, de lo contrario false...

Nota:
Tus puntos no se incluyen en la matriz de puntos de tu clase. ¡No los olvides al calcular la puntuación media!*/
public class ScoreComparison {

    public static void main(String[] args) {
        int[] classScores = {14, 9, 17, 8, 12};
        int myScore = 17;

        System.out.println(isAboveAverage(classScores, myScore));
    }
    public static boolean isAboveAverage(int[] classScores, int myScore) {
        int total = 0;

        for (int score : classScores) {
            total += score;
        }
        return myScore > (double) total / classScores.length;
    }
}
