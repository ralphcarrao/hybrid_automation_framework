package utilities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Directory {

    public void delete() {
        try {
            String root = System.getProperty("user.home");
            String cbkFolder = root + "\\Documents\\CloudBacko Pro\\";
            File file = new File(cbkFolder);
            FileUtils.cleanDirectory(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean checkContentOfDestinationPath() {
        String root = System.getProperty("user.home");
        String cbkFolder = root + "\\OneDrive\\Documents\\CloudBacko Pro\\";
        File file = new File(cbkFolder);
        File[] contents = file.listFiles();
        String timestampPath = null;
        for (File content : contents) {
            timestampPath = content.getAbsolutePath();
        }
        file = new File(timestampPath);
        if (file.listFiles().length == 2) {
            return true;
        }

    }
}
