package Medication;


import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class IO {


    public void write1(String filepath, String ele1){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write2(String filepath, String ele1, String ele2){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write3(String filepath, String ele1, String ele2, String ele3){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write4(String filepath, String ele1, String ele2, String ele3, String ele4){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3 + "," + ele4);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write5(String filepath, String ele1, String ele2, String ele3, String ele4, String ele5){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3 + "," + ele4 + "," + ele5);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write6(String filepath, String ele1, String ele2, String ele3, String ele4, String ele5, String ele6){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3 + "," + ele4 + "," + ele5 + "," + ele6);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write7(String filepath, String ele1, String ele2, String ele3, String ele4, String ele5, String ele6, String ele7){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3 + "," + ele4 + "," + ele5 + "," + ele6 + "," + ele7);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write8(String filepath, String ele1, String ele2, String ele3, String ele4, String ele5, String ele6, String ele7, String ele8){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3 + "," + ele4 + "," + ele5 + "," + ele6 + "," + ele7 + "," + ele8);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write9(String filepath, String ele1, String ele2, String ele3, String ele4, String ele5, String ele6, String ele7, String ele8, String ele9){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3 + "," + ele4 + "," + ele5 + "," + ele6 + "," + ele7 + "," + ele8 + "," + ele9);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }
    public void write10(String filepath, String ele1, String ele2, String ele3, String ele4, String ele5, String ele6, String ele7, String ele8, String ele9, String ele10){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ele1 + "," + ele2 + "," + ele3 + "," + ele4 + "," + ele5 + "," + ele6 + "," + ele7 + "," + ele8 + "," + ele9 + "," + ele10);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }

    public void write15(Boolean done, Boolean nouveau, String name, String size, Object type, String use, String bMorning,
            String morning, String noon, String evening, String night, String bSleep, String storage, String diff, String infos, String filepath){

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(done + "," + nouveau + "," + name + "," + size + "," + type + "," + use + "," +
                    bMorning + "," + morning + "," + noon + "," + evening + "," + night + "," + bSleep + "," +
                    storage + "," + diff + "," + infos);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record not saved");
        }
    }

    public ArrayList<String> read(String filepath){

        ArrayList<String> tab = new ArrayList<>();

        try{
            Scanner scanner = new Scanner(new File(filepath));
            while(scanner.hasNext()){ tab.add(scanner.next()); }
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erreur");
        }
        return tab;
    }
    public void readUnderstanding(String filepath){
        try{
            FileReader fr = new FileReader(filepath);
            BufferedReader reader = new BufferedReader(fr);

            String s;
            while((s = reader.readLine()) != null){
                System.out.println(s);
            }
            reader.close();
        } catch(IOException ex){
            System.out.println("Error");
        }
    }


    // modify the cell if it equals to stringToChange
    public void csvModify(String filePath, String stringToChange, String newString) {
        File fileToBeModified = new File(filePath);

        BufferedReader reader = null;
        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            String line = reader.readLine();
            String list = "";
            String finalProduct = "";
            while (line != null)
            {
                String[] tab = line.split(",");
                for (int i = 0; i < tab.length; i++){
                    if (tab[i].equals(stringToChange)){
                        String nouveauString = tab[i].replace(stringToChange, newString);
                        list = list + nouveauString;
                    }
                    else list = list + tab[i];

                    if ( i == tab.length - 1){
                        list = list + System.lineSeparator();
                    }
                    else list = list + ",";
                }
                finalProduct = finalProduct + list;
                list = "";
                line = reader.readLine();
            }

            writer = new FileWriter(fileToBeModified);
            writer.write(finalProduct);

            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // modify the cell if it equals to stringToChange AND in the right cell
    public void csvModifyColumn(String filePath, String stringToChange, String newString, int column) {
        File fileToBeModified = new File(filePath);

        BufferedReader reader = null;
        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            String line = reader.readLine();
            String list = "";
            String finalProduct = "";
            while (line != null)
            {
                String[] tab = line.split(",");
                for (int i = 0; i < tab.length; i++){
                    if ( i == column ){
                        if (tab[i].equals(stringToChange)){
                            String nouveauString = tab[i].replace(stringToChange, newString);
                            list = list + nouveauString;
                        }
                        else list = list + tab[i];
                    }
                    else list = list + tab[i];

                    if ( i == tab.length - 1){
                        list = list + System.lineSeparator();
                    }
                    else list = list + ",";
                }
                finalProduct = finalProduct + list;
                list = "";
                line = reader.readLine();
            }

            writer = new FileWriter(fileToBeModified);
            writer.write(finalProduct);

            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



    // remove the line if a cell contains removeTerm
    public void csvRemoveString(String filePath, String removeTerm) {
        File fileToBeModified = new File(filePath);

        BufferedReader reader = null;
        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            String line = reader.readLine();
            String list = "";
            String finalProduct = "";
            while (line != null)
            {
                String[] tab = line.split(",");
                for (int i = 0; i < tab.length; i++){

                    if (tab[i].equals(removeTerm)){
                        list = "";
                        break;
                    }
                    else list = list + tab[i];

                    if ( i == tab.length - 1){
                        list = list + System.lineSeparator();
                    }
                    else list = list + ",";
                }
                finalProduct = finalProduct + list;
                list = "";
                line = reader.readLine();
            }

            writer = new FileWriter(fileToBeModified);
            writer.write(finalProduct);

            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // remove the line if the column cell == removeTerm
    public void csvRemoveStringColumn(String filePath, String removeTerm, int column) {
        File fileToBeModified = new File(filePath);

        BufferedReader reader = null;
        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            String line = reader.readLine();
            String list = "";
            String finalProduct = "";
            while (line != null)
            {
                String[] tab = line.split(",");
                for (int i = 0; i < tab.length; i++){

                    if ( i == column){
                        if (tab[i].equals(removeTerm)){
                            list = "";
                            break;
                        }
                        else list = list + tab[i];
                    }
                    else list = list + tab[i];

                    if ( i == tab.length - 1){
                        list = list + System.lineSeparator();
                    }
                    else list = list + ",";
                }
                finalProduct = finalProduct + list;
                list = "";
                line = reader.readLine();
            }

            writer = new FileWriter(fileToBeModified);
            writer.write(finalProduct);

            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public void csvRemoveStringRow(String filepath, int index){
        File fileToBeModified = new File(filepath);

        BufferedReader reader = null;
        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            int indexInitial = 0;
            String finalProduct = "";

            while (line != null)
            {
                if (index != indexInitial){
                    indexInitial++;
                    finalProduct = finalProduct + line + System.lineSeparator();
                    line = reader.readLine();
                }
                else {
                    indexInitial++;
                    line = reader.readLine();
                }

            }
            writer = new FileWriter(fileToBeModified);
            writer.write(finalProduct);

            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // index == row
    public String readRow(String filepath, int index){

        ArrayList<String> tab = new ArrayList<>();
        File fileToBeModified = new File(filepath);
        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            int indexPosition = 0;

            while (indexPosition != index){
                indexPosition++;
                line = reader.readLine();
            }
            return line;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"error");
        }
        return null;
    }

    public ArrayList<String> readColumn(String filepath, int column){
        ArrayList<String> tab = new ArrayList<>();
        File fileToBeModified = new File(filepath);
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();

            while (line != null){

                String cell = "";
                int i0 = line.indexOf(",");
                int i1 = line.indexOf(",", i0 + 1);
                int i2 = line.indexOf(",", i1 + 1);
                int i3 = line.indexOf(",", i2 + 1);
                int i4 = line.indexOf(",", i3 + 1);
                int i5 = line.indexOf(",", i4 + 1);
                int i6 = line.indexOf(",", i5 + 1);
                int i7 = line.indexOf(",", i6 + 1);
                int i8 = line.indexOf(",", i7 + 1);
                int i9 = line.indexOf(",", i8 + 1);
                int i10 = line.indexOf(",", i9 + 1);
                int i11 = line.indexOf(",", i10 + 1);
                int i12 = line.indexOf(",", i11 + 1);
                int i13 = line.indexOf(",", i12 + 1);

                switch(column) {
                    case 0: cell = line.substring(i0); break;
                    case 1: cell = line.substring(i0+1,i1); break;
                    case 2: cell = line.substring(i1+1,i2); break;
                    case 3: cell = line.substring(i2+1,i3); break;
                    case 4: cell = line.substring(i3+1,i4); break;
                    case 5: cell = line.substring(i4+1,i5); break;
                    case 6: cell = line.substring(i5+1,i6); break;
                    case 7: cell = line.substring(i6+1,i7); break;
                    case 8: cell = line.substring(i7+1,i8); break;
                    case 9: cell = line.substring(i8+1,i9); break;
                    case 10: cell = line.substring(i9+1,i10); break;
                    case 11: cell = line.substring(i10+1,i11); break;
                    case 12: cell = line.substring(i11+1,i12); break;
                    case 13: cell = line.substring(i12+1,i13); break;
                    case 14: cell = line.substring(i13+1); break;
                }

                if (!cell.equals(",")) tab.add(cell);
                else tab.add("null");
                line = reader.readLine();
            }
            return tab;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"error");
        }
        return null;
    }

    // public void search(){};
    // public void search
    // search return tab
















}

