package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {

    private static final StringBuilder LOG = new StringBuilder("");

    public static void main(String[] args) {
        String userHomeDir = System.getProperty("user.home");
        String dirPathToInstallGame = userHomeDir + File.separator + "Games";
        File dirToInstallGames = new File(dirPathToInstallGame);
        dirToInstallGames.mkdirs();
        LOG.append("Directory '" + dirToInstallGames.getAbsolutePath() + "' is created\n");

        for (String gameDir: Arrays.asList("src", "res", "savegames", "temp")) {
            String gamesInternalDir = dirPathToInstallGame + File.separator + gameDir;
            if (new File(gamesInternalDir).mkdir()) {
                LOG.append("Game directory " + gamesInternalDir + " has been created\n");
            } else {
                LOG.append("WARN: Game directory " + gamesInternalDir + " hasn't been created or directory already exists\n");
            }
        }

        String gameSrcDir = dirPathToInstallGame + File.separator + "src";
        for (String srcDirectory : Arrays.asList("main", "test")) {
            String gamesSrcDir = dirPathToInstallGame + File.separator + "src" + File.separator + srcDirectory;
            if (new File(gamesSrcDir).mkdir()) {
                LOG.append("Game src directory " + gamesSrcDir + " has been created\n");
            } else {
                LOG.append("WARN: Game src directory " + gamesSrcDir + " hasn't been created or directory already exists\n");
            }
        }

        String gameJavaSourcesDir = gameSrcDir + File.separator + "main";
        for (String gameJavaClass : Arrays.asList("Main.java", "Utils.java")) {
            String javaClassFilePath = gameJavaSourcesDir + File.separator + gameJavaClass;
            try {
                if (new File(javaClassFilePath).createNewFile()) {
                    LOG.append("Game java class '" + javaClassFilePath + "' has been created\n");
                } else {
                    LOG.append("WARN: Game java class '" + javaClassFilePath + "' hasn't been created or file already exists\n");
                }
            } catch (IOException ex) {
                LOG.append("Something went wrong on creation file '" + javaClassFilePath + "'. Exception: " + ex.getMessage());
            }
        }

        String resGameDirectory = dirPathToInstallGame + File.separator + "res";
        for (String dirInTheRes: Arrays.asList("drawables", "vectors", "icons")) {
            String resDirectory = resGameDirectory + File.separator + dirInTheRes;
            if (new File(resDirectory).mkdir()) {
                LOG.append("Resource directory " + resDirectory + "has been created\n");
            } else {
                LOG.append("WARN: Resource directory " + resDirectory + "hasn't been created or directory already exists\n");
            }
        }

        String logFilePath = dirPathToInstallGame + File.separator + "temp" + File.separator + "temp.txt";
        File logFile = new File(logFilePath);
        try {
            logFile.createNewFile();
            FileWriter writerToLogFile = new FileWriter(logFile, true);
            writerToLogFile.write(LOG.toString());
            writerToLogFile.flush();
        } catch (IOException ex) {
            System.out.println("Can't write log to file '" + logFilePath + "'. Log will be written to STDOUT");
            System.out.print(LOG.toString());
        }
    }
}
