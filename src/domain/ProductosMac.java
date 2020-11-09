package domain;

public class ProductosMac {

        private String nombreProducto;

        public ProductosMac(){
        }

        public ProductosMac(String nombreProducto){
            this.nombreProducto = nombreProducto;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        @Override
        public String toString() {
            return  this.nombreProducto;
        }
    }

