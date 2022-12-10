package studyGuide.chapter1_blocks.example10;

import java.nio.file.Files;
import java.nio.file.Paths;

public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}

/*
* Now let’s consider some imports that don’t work:
* import java.nio.*;                // NO GOOD – a wildcard only matches//class names, not "file.*Files"
* import java.nio.*.*;              // NO GOOD – you can only have one wildcard//and it must be at the end
* import java.nio.files.Paths.*;    // NO GOOD – you cannot import methods//only class names
* */
