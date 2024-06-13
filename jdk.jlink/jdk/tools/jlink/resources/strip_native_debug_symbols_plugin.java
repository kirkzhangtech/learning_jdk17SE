package jdk.tools.jlink.resources;

import java.util.ListResourceBundle;

public final class strip_native_debug_symbols_plugin extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "strip-native-debug-symbols.argument", "<exclude-debuginfo-files|keep-debuginfo-files|objcopy=/path/to/objcopy>" },
            { "strip-native-debug-symbols.description", "Strip debug symbols from native libraries (if any). \n This plugin requires at least one option: \n   objcopy: The path to the 'objcopy' binary. Defaults to 'objcopy' in PATH.\n   exclude-debuginfo-files: Exclude debug info files. Defaults to true.\n   keep-debuginfo-files[=<ext>]: Keep debug info files in <file>.<ext>.\n                                 Defaults to <file>.debuginfo \n Examples: --strip-native-debug-symbols keep-debuginfo-files:objcopy=/usr/bin/objcopy \n           --strip-native-debug-symbols=exclude-debuginfo-files\n" },
            { "strip-native-debug-symbols.error.debugfile", "Error: {0}: Creating debug info file for ''{1}'' failed." },
            { "strip-native-debug-symbols.error.file", "Error: {0}: Stripping debug info for file ''{1}'' failed." },
            { "strip-native-debug-symbols.iae", "{0}: Unrecognized argument ''{1}''" },
            { "strip-native-debug-symbols.iae.conflict", "{0}: Cannot use ''{1}'' and ''{2}'' at the same time" },
            { "strip-native-debug-symbols.invalidstrip", "Invalid objcopy command: {0}" },
            { "strip-native-debug-symbols.usage", "  --strip-native-debug-symbols       <exclude-debuginfo-files|keep-debuginfo-files|objcopy=PATH_TO_OBJ>\n                            Strip debug symbols from native libraries (if any). \n                            This plugin requires at least one option:\n                               objcopy: The path to the 'objcopy' binary.\n                                        Defaults to 'objcopy' in PATH.\n                               exclude-debuginfo-files: Exclude debug info \n                                        files. Defaults to true.\n                               keep-debuginfo-files[=<ext>]: Keep debug info\n                                        files in <file>.<ext>.\n                               Defaults to <file>.debuginfo \n                            Examples: --strip-native-debug-symbols \n                                        keep-debuginfo-files:objcopy=OBJPATH\n                               --strip-native-debug-symbols\n                                        exclude-debuginfo-files" },
        };
    }
}
