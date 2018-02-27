
package bean;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;

public class ReadImage {
    
    static final File dir=new File("/home/rajendra/Desktop/Planets");
    
    static final String[] EXTENSIONS=new String[]{"gif", "jpeg", "jpg", "png", "bmp"};
    
    static final FilenameFilter IMAGE_FILTER =new FilenameFilter(){
        
        @Override
        public boolean accept(final File  Dir, final String name)
        {
            
            for(final String ext:EXTENSIONS)
            {
             
                if(name.endsWith("."+ext))
                {
                 
                    return true;
                }
            }
            
            
            
            return false;
        }
        
    };
    
    
    
    
    public static List<File> Retrive()
    {
        
        List<File> al=new ArrayList<File>();
        if(dir.isDirectory())
        {
            for(final File f:dir.listFiles(IMAGE_FILTER))
            {
                BufferedImage img=null;
                
                try 
                {
                    img=ImageIO.read(f);
                    al.add(f);
                    
                    /*System.out.println("image: " + f.getAbsolutePath());
                    System.out.println(" width : " + img.getWidth());
                    System.out.println(" height: " + img.getHeight());
                    System.out.println(" size  : " + f.length());*/
                    
                }catch (final IOException e) {
                    // handle errors here
                }
            }
        }
        
        
        return al;
        
    }
    
    public static void main(String [] args)
    {
        
        
          List img=ReadImage.Retrive();
               Iterator<File> it = img.iterator();       
            
             while(it.hasNext())
             {
               File imgnext=it.next();
               System.out.println(imgnext.getAbsolutePath());
             }
        
    }
    
    
}
