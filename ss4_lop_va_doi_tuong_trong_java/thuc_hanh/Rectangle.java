package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

    public class Rectangle {
        double width, heigth;

        public Rectangle(){
        }
        public Rectangle(double width,double heigth){
            this.width = width;
            this.heigth = heigth;
        }
        public double getArea(){
            return this.width*this.heigth;
        }
        public double getPerimeter(){
            return this.width*this.heigth/2;
        }
        public String display(){
            return "Hình chữ nhật { chiều dài " + width + "chiều rộng " +heigth + "}"  ;

        }
    }

