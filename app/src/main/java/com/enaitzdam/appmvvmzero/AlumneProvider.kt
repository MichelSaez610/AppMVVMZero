package com.enaitzdam.appmvvmzero

class AlumneProvider {
    companion object {
        private var posicioAlumne = 0

        fun count(): Alumne {
            if (posicioAlumne >= Alumnes.size) {
                posicioAlumne = 0
            }
            val alumne = Alumnes[posicioAlumne]
            posicioAlumne++
            return alumne
        }

        fun getTotalAlumnes(): Int{
            return Alumnes.size
        }

        private val Alumnes = listOf(
            Alumne(nom = "Juan", edat = 13),
            Alumne(nom = "Pepe", edat = 15),
            Alumne(nom = "Santi", edat = 12),
            Alumne(nom = "Leon", edat = 15),
            Alumne(nom = "Andrea", edat = 11),
            Alumne(nom = "Janne", edat = 13),
            Alumne(nom = "Luis", edat = 16),
            Alumne(nom = "Carre", edat = 13),
            Alumne(nom = "Pedro", edat = 19),
            Alumne(nom = "Leo", edat = 13),
            Alumne(nom = "Marta", edat = 14),
            Alumne(nom = "Sofia", edat = 15),
            Alumne(nom = "Hugo", edat = 12),
            Alumne(nom = "Lucia", edat = 13),
            Alumne(nom = "Carlos", edat = 14),
            Alumne(nom = "Nina", edat = 11),
            Alumne(nom = "Diego", edat = 16),
            Alumne(nom = "Sara", edat = 15),
            Alumne(nom = "Pablo", edat = 14),
            Alumne(nom = "Isabel", edat = 12),
            )
    }
}

