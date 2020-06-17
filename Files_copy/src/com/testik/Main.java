package com.testik;

import java.io.*;
import java.nio.Buffer;

public class Main
{

    public static void main(String[] args) throws IOException
    {

        /* FileReader fileReader = new FileReader("C:\\Copy_test\\TEST_1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();
        System.out.println(s);*/

        /*FileInputStream fileInputStream = new FileInputStream("C:\\Copy_test\\TEST_1.txt");
        OutputStream outputStream = new FileOutputStream("F:\\Copy_TestIN\\TEST_1.txt");

        byte read = (byte) fileInputStream.read();
        String s = new String (new byte[]{read});
        System.out.println(s);*/


        /*InputStream inputStream = new FileInputStream("C:\\Copy_test\\TEST_1.txt");
        OutputStream outputStream = new FileOutputStream("F:\\Copy_TestIN\\TEST_1.txt");

//Не рабочие варианты
        InputStream inputStream = new FileInputStream("F:\\Copy_TestIN\\2020-06-12 15.20.29.mp4");
        OutputStream outputStream = new FileOutputStream("C:\\Copy_test\\2020-06-12 15.20.29.mp4");

        InputStream inputStream = new FileInputStream("F:\\Files\\Files\\OnePlus5Oxygen_23_OTA_063.zip");
        OutputStream outputStream = new FileOutputStream("C:\\Copy_test\\OnePlus5Oxygen_23_OTA_063.zip");
*/
//----------------------------------------------------------------------------------------------------------
//Рабочий вариант 1;


       /* InputStream inputStream = new FileInputStream("F:\\Copy_TestIN\\2020-06-12 15.20.29.mp4");  //открытие и чтение файла
        OutputStream outputStream = new FileOutputStream("C:\\Copy_test\\2020-06-12 15.20.29.mp4");  //открытие фала для записи
        try             //проверка исключений
        {
            byte[] b = new byte[9999999];        // массив byte
            int size;                           // переменная
            while ((size = inputStream.read(b)) > 0)      //цикл с условием при котором проверяется чтение файла
            {
                outputStream.write(b, 0, size);          //запись
            }
        }
        finally
        {
            inputStream.close();             //закрытие файлов
            outputStream.close();
        }*/
//-------------------------------------------------------------------------------------------------------
      /*  //Рабочий вариант 2;
        InputStream inputStream = new FileInputStream("F:\\Files\\Files\\OnePlus5Oxygen_23_OTA_063.zip");
        OutputStream outputStream = new FileOutputStream("C:\\Copy_test\\NewFileOS.zip");
        byte[] b = new byte[9999999];
        int size;
        while ((size = inputStream.read(b)) > 0)
            {
                outputStream.write(b, 0, size);
            }
        inputStream.close();
        outputStream.close();
    }
}*/
//-------------------------------------------------------------------------------------------------------

//Вариант 3. Buffering
    BufferedInputStream bufferedInputStream = new BufferedInputStream (new FileInputStream("F:\\Files\\Files\\OnePlus5Oxygen_23_OTA_063.zip"));
    BufferedOutputStream bufferedoutputStream = new BufferedOutputStream (new FileOutputStream("C:\\Copy_test\\FileCopy.zip"));
        byte[] b = new byte[9999999];
        int size;
        while ((size = bufferedInputStream.read(b)) > 0)
        {
            bufferedoutputStream.write(b, 0, size);
        }
        bufferedInputStream.close();
        bufferedoutputStream.close();
    }
}