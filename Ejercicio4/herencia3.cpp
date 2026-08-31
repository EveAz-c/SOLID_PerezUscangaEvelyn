
#include <iostream>
#include <string>
using namespace std;
class Animal {
public:
	string nombre;
	// contrauctor basico de la clase animal
	//parametros del contructor
	// el parametro nombre se pase 
	//Animal(string n) : nombre(n);
	Animal(string nombre) : nombre(nombre) {
		cout << "Animal andando" << endl;
	}

	void andar() {
		cout << nombre << "está nadando" << endl;
	}
};

class Perro :public Animal {
public:
	Perro(string nombre) : Animal(nombre) {
	}
	void ladrar() {
		cout << nombre << "está ladrando" << endl;
	}
	void andar() {
		cout << nombre << "esta andando" << endl;
	}
};
int main() {
	Perro perro1("Firulais");
	perro1.ladrar();
	perro1.andar();

	Pato pato1("Justin");
	pato1.andar();

};

class Volador : virtual public Animal {
public:
	Volador(string nombre) : Animal(nombre) {
	}
	void andar() {
		cout << nombre << "está nadando" << endl;
	}
};
class Nadador : virtual public Animal {
public:
	Nadador(string nombre) : Animal(nombre) {
	}
	void nadar() {
		cout << nombre << "está nadando" << endl;
	}
};
class Pato : public Volador, public Nadador, Animal(nombre) {
public:
	Pato(string nombre) : Nadador(nombre), Volador(nombre) {}
	void
		void graznar() {
		cout << nombre << "está graznando" << endl;
	}
	void andar() {
		cout << nombre << "está caminando" << endl;
	}
};