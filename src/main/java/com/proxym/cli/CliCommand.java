package com.proxym.cli;

import com.proxym.cli.commands.ExportCommand;
import com.proxym.cli.commands.GetServiceCommand;
import com.proxym.cli.commands.LoadServiceCommand;
import com.proxym.cli.commands.ServiceStatusCommand;
import com.proxym.cli.service.ServiceObject;
import com.proxym.cli.serviceaccess.YamlParser;
import com.proxym.cli.servicedao.ServiceRepository;
import io.micronaut.configuration.picocli.PicocliRunner;

import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.ArrayList;
import java.util.List;

@Command(name = "cli", description = "...",
        mixinStandardHelpOptions = true,subcommands = {ExportCommand.class, LoadServiceCommand.class, GetServiceCommand.class, ServiceStatusCommand.class},version = "1.0")



public class CliCommand implements Runnable {


    public static void main(String[] args) throws Exception {
        PicocliRunner.run(CliCommand.class, args);
    }

    public void run() {



    }
}
