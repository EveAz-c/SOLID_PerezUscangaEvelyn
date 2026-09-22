type Plan = "basico" | "normal" | "chipocludo"

class User{
    constructor(
        private nombre: string,
        private email: string,
        private edad: number,
        private plan: Plan
    )
    getNombre(): string{
        return this.nombre;
    }
    getEmail(): string{
        return this.email
    }
    getEdad(): number{
        return this.edad;
    }
    getPlan(): Plan{
        return this.plan;
    }
    
}
class Validador{
    validarUsuario(user : User){
        if(user.getNombre().length < 1){
            console.log('Nombre ${user.getNombre()} es demasiado corto');
        }
        if(user.getEdad() < 16){
            console.log("Debes ser mayor a 16 para entrar");
        }
        if(!user.getEmail().includes('@')){
            console.log('El email ${user.getEmail()} no es valido');
            return false;
        }
        return true;
    }
}
class Facturadora{
    calcularPrecio(): number{
        const precios: Record<string, number> = {"basico": 300, "normal": 550, "chipocludo": 999};
        const precio: number = precios[User.getPlan()];
        return precio;
    }
    generarFactura(): string{
        const folio: string = 'club Deportivo - ${Date.toString}';
        const factura: string = '${folio} \n Cliente ${user.getNombre()} | Plan ${user.getPlan()} | Total: ${this.calcularPrecio(user)}'
        return factura;
    }
}
class servicioCorreo{
    mandaEmailBienvenida(user: User): void {
        console.log('Email enviado al correo: ${user.getEmail()}');
        console.log('Bienvenido ${user.getNombre()} \n ');
    }
}
class RepositorioBD{
    guardarEnBD(): boolean{
        console.log('Insertando usuario dentro de la base de datos...');
        console.log('INSERT INTO user (nombre,email,edad,plan) VALUES ('${user.getNombre()}' , '${user.get.Email()}', '${user.getEdad()}', '${user.getPlan()}')');
        return true;
    }
}
class ServicioDeportivo{
    constructor{
        private validador: Validador,
        private facturadora: Facturadora,
        private servicioCorreo: servicioCorreo,
        private repositorio: RepositorioBD
    }{}
    registrarSuscripcion(): boolean{
        if(this.validador.validarUsuario(user)){
            this.repositorio.guardarEnBD(user);
            this.servicioCorreo.mandarEmailBienvenida(user);
            console.log('Usuario registrado con exito en el plan ${user.getPlan()}');
            return true;
        }
        return false;
    }
}
const vogan = new User('Vaughan', 'lobita@gmail.com', 48, "chipocludo");
const britania = ServicioDeportivo(new Validador(), new servicioCorreo(), new RepositorioBD())
britania.registrarSuscripcion(vogan)
