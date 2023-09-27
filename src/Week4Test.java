import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Week4Test {
    // Test theo giá trị biên
    @Test
    public void Out_Of_Min(){
        int a = 0;
        String expected = "Chiều cao không hợp lệ. Xin nhập lại";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_C1(){
        int a = 50;
        String expected = "Miễn Phí";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_C1(){
        int a = 65;
        String expected = "Miễn Phí";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_C1(){
        int a = 99;
        String expected = "Miễn Phí";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_C2(){
        int a = 100;
        String expected = "30000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_C2(){
        int a = 110;
        String expected = "30000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_C2(){
        int a = 119;
        String expected = "30000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_C3(){
        int a = 120;
        String expected = "60000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_C3(){
        int a = 130;
        String expected = "60000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_C3(){
        int a = 139;
        String expected = "60000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Min_C4(){
        int a = 140;
        String expected = "80000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Nom_C4(){
        int a = 175;
        String expected = "80000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Max_C4(){
        int a = 299;
        String expected = "80000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    @Test
    public void Out_Of_Max(){
        int a = 350;
        String expected = "Chiều cao không hợp lệ. Xin nhập lại";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected,actual);
    }

    // Test theo bảng quyết định
    @Test
    public void Test1(){
        int a = 1000;
        String expected = "Chiều cao không hợp lệ. Xin nhập lại";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test2(){
        int a = 66;
        String expected = "Miễn Phí";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test3(){
        int a = 112;
        String expected = "30000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test4(){
        int a = 134;
        String expected = "60000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test5(){
        int a = 185;
        String expected = "80000 đồng";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected, actual);
    }
    @Test
    public void Test6(){
        int a = 495;
        String expected = "Chiều cao không hợp lệ. Xin nhập lại";
        String actual = Week4.PriceOfTicket(a);
        assertEquals(expected, actual);
    }
}