/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleanup.the.garbage;

import java.io.File;

public class CleanUpTheGarbage {

public static void main(String[] args) {
File directory = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\PlasticsSolutionsUSAScraperLauncher\\HoldTheCSV");
int start = 0;
int finish = 3;
// Get all files in directory
while (start != finish)
{
//pick the folder to dele
if (start == 0)
        {
         directory = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\PlasticsSolutionsUSAScraperLauncher\\HoldTheCSV");   
        }
if (start == 1)
        {
        directory = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\LeonardScraperLauncher\\CSVSection");    
        }
if (start == 2)
        {
         directory = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\DateInsertLauncherScraper\\DateInsertCSVManipulationArea");   
        }
  

//delete process    
File[] files = directory.listFiles();
for (File file : files)
{
// Delete each file
if (!file.delete())
{
// Failed to delete file
System.out.println("Failed to delete "+file);
}
}
start++;
}
    }   
}