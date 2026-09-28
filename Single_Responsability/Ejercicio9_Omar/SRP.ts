//Suscripciones club deportivo
type Plan = "basico" | "intermedio" | "pro";
class Cliente{
    constructor(
        public nombre: string,
        public email: string,
        public edad: number,
        public plan: Plan
    ) {}
    validarUsuario(): boolean {
        if(this.nombre.length < 2){
            console.log("nombre invalido");
            return false;
        }
        if (this.edad < 16){
            console.log("Debes ser mayor de 15");
            return false;
        }
        if(!this.email.includes("@")){
            console.log(`El correo ${this.email} no es un correo valido`);
        }
        return true;
    }
    guardarEnBD(): void {
        if(this.validarUsuario()){
            console.log('Insertando ${this.nombre}');
            console.log('INSERT INTO clientes (nombre, email, edad, plan) VALUES (${this.nombre}, ${this.email}, ${this.edad}, ${this.plan})');

        }
    }
    calcularPrecio(): number {
        const precios: Record<Plan, number> = {"basico": 299, "intermedio": 499, "pro": 999};
        const precio = precios[this.plan];
        return precio;
    }
    generarFactura(): string {
        const folio = 'Britania - ${Date.now()}'
        const factura = '${folio} \n Cliente: ${this.nombre} | Plan: ${this.plan} | Precio: ${this.calcularPrecio()} | Folio: ${folio}';
        return factura;
    }
    enviarCorreo(){
        console.log('Bienvenido ${this.nombre} a nuestro club deportivo, tu plan es ${this.plan} y tu precio es ${this.calcularPrecio()}');
        console.log(this.generarFactura());
    }
    registrarSuscripcion(): boolean{
        if (this.validarUsuario()){
            this.guardarEnBD();
            this.enviarCorreo();
            return true;
        }
        return false;
    }
const Angel = new Cliente("Angel", "angel@example.com", 20, "basico");
angel.registrarSuscripcion();

}