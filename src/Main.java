
import base.JSONModel;
import commands.AddNoteCommand;
import factory.JSONModelFactory;
import java.io.IOException;
import org.json.simple.parser.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException, InstantiationException, IllegalAccessException {
        System.out.println(note.toJSON());
    }
}
