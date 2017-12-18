//Thomas Varano
//[Program Descripion]
//Nov 28, 2017

package resources;

import java.io.InputStream;

import javax.swing.ImageIcon;

import constants.ErrorID;

public final class ResourceAccess
{
   public static InputStream getResource(String localPath) {
      return ResourceAccess.class.getResourceAsStream(localPath);
   }
   
   public static ImageIcon getImage(String localPath) {
      try {
         return new ImageIcon(ResourceAccess.class.getResource(localPath));
      } catch (NullPointerException e) {
         ErrorID.showError(e, true);
         return null;
      }
   }
}
