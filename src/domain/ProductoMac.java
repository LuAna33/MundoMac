package domain;

public class ProductoMac {

        private String nombreProducto;

        public ProductoMac(){
        }

        public ProductoMac(String nombreProducto){
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

