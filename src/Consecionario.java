public class Consecionario {
    public Consecionario() {
    }

    public void Toyota() {
        Carro toyota = new Carro();
        toyota.setMarca("Toyota");
        toyota.setModelo("Supra");
        toyota.setAFabricacion("2020");
        toyota.setColor("Rojo");
        toyota.setKilometraje("15000");
        toyota.setPlaca("ABC-123");
        toyota.setCombustible("Gasolina");
        toyota.setConsumo("30 km/gal");

        toyota.setTipo("Deportivo");
        toyota.setMotor("3.0 Turbo");
        toyota.setCilindraje("3000 cc");
        toyota.setSuspension("Deportiva");
        toyota.setTraccion("Trasera");

        toyota.MostrarCarro();
    }

    public void Honda(){
        Carro honda = new Carro();
        honda.setMarca("Honda");
        honda.setModelo("Civi");
        honda.setAFabricacion("2018");
        honda.setColor("Negro");
        honda.setKilometraje("45000");
        honda.setPlaca("XYZ-789");
        honda.setCombustible("Gasolina");
        honda.setConsumo("40 km/gal");

        honda.setTipo("Sedan");
        honda.setMotor("2.0 i-VTEC");
        honda.setCilindraje("2000 cc");
        honda.setSuspension("Estandar");
        honda.setTraccion("Delantera");

        honda.MostrarCarro();
    }

    public void Nissan() {
        Carro nissan = new Carro();
        nissan.setMarca("Nissan");
        nissan.setModelo("Skyline GT-R");
        nissan.setAFabricacion("2020");
        nissan.setColor("Gris metalico");
        nissan.setKilometraje("30000");
        nissan.setPlaca("NIS-456");
        nissan.setCombustible("Gasolina");
        nissan.setConsumo("35 km/gal");

        nissan.setTipo("Deportivo");
        nissan.setMotor("3.8 Twin Turbo V6");
        nissan.setCilindraje("3800 cc");
        nissan.setSuspension("Deportiva");
        nissan.setTraccion("AWD (traccion total)");

        nissan.MostrarCarro();
    }

    public void Yamaha() {
        Moto yamaha = new Moto();
        yamaha.setMarca("Yamaha");
        yamaha.setModelo("YZF-R6");
        yamaha.setAFabricacion("2021");
        yamaha.setColor("Azul Racing");
        yamaha.setKilometraje("12000 km");
        yamaha.setPlaca("YMH-221");
        yamaha.setCombustible("Gasolina");
        yamaha.setConsumo("55 km/gal");

        yamaha.setTipo("Motocicleta Deportiva");
        yamaha.setTipoManubrio("Deportivo bajo");
        yamaha.setCilindraje("599 cc");
        yamaha.setTipoFreno("Frenos de disco ABS");
        yamaha.setTransmision("Manual de 6 velocidades");
        yamaha.setTipoEscape("Escape deportivo Yoshimura");

        yamaha.MostrarMoto();
    }

    public void Kawasaki() {
        Moto kawasaki = new Moto();
        kawasaki.setMarca("Kawasaki");
        kawasaki.setModelo("Ninja ZX-6R");
        kawasaki.setAFabricacion("2022");
        kawasaki.setColor("Verde Lima");
        kawasaki.setKilometraje("9000 km");
        kawasaki.setPlaca("KWS-636");
        kawasaki.setCombustible("Gasolina");
        kawasaki.setConsumo("50 km/gal");

        kawasaki.setTipo("Motocicleta Deportiva");
        kawasaki.setTipoManubrio("Deportivo Bajo");
        kawasaki.setCilindraje("3800 cc");
        kawasaki.setTipoFreno("Frenos de disco ABS");
        kawasaki.setTransmision("Manual de 6 velocidades");
        kawasaki.setTipoEscape("Escape deportivo Akrapovic");

        kawasaki.MostrarMoto();
    }

    public void Suzuki(){
        Moto suzuki = new Moto();
        suzuki.setMarca("Suzuki");
        suzuki.setModelo("GSX-R750");
        suzuki.setAFabricacion("2020");
        suzuki.setColor("Azul y Blanco");
        suzuki.setKilometraje("15000 km");
        suzuki.setPlaca("SZK-750");
        suzuki.setCombustible("Gasolina");
        suzuki.setConsumo("52 km/gal");

        suzuki.setTipo("Motocicleta Deportiva");
        suzuki.setTipoManubrio("Deportivo Bajo");
        suzuki.setCilindraje("750 cc");
        suzuki.setTipoFreno("Frenos de disco Brembo ABS");
        suzuki.setTransmision("Manual de 6 velocidades");
        suzuki.setTipoEscape("Escape deportivo Yoshimura"); 

        suzuki.MostrarMoto();
    }

}
