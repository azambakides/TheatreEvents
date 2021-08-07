package com.andraea.app.model;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Show {

    /// Details of the Show
    public static TheatreTemplates TheNutcracker = new TheatreTemplates("21/12/2021", "11.30am", "3.30pm", "7.30pm", "The Nutcracker", 30.00);

    public static TheatreTemplates AnInspectorCalls = new TheatreTemplates("09/09/2021", "11.30am", "3.30pm", "7.30pm", "An Inspector Calls", 20.00);

    public static TheatreTemplates JosephAndTheAmazingTechnicolorDreamcoat = new TheatreTemplates("10/11/2021", "11.30am", "3.30pm", "7.30pm", "Joseph and the Amazing Technicolor Dreamcoat", 15.00);

    public static TheatreTemplates LaBoheme = new TheatreTemplates("11/11/2021", "11.30am", "3.30pm", "7.30pm", "La Boheme", 35.50);

    //public static List<TheatreTemplates> getAllShows() {

//     ArrayList
//    ArrayList showList = new ArrayList();

//   public static List<TheatreTemplates> showList = new ArrayList<>();
//   list.add("21/12/2021", "11.30am", "3.30pm", "7.30pm", "The Nutcracker", 30.00);
//   list.add("09/09/2021", "11.30am", "3.30pm", "7.30pm","An Inspector Calls", 20.00);
//   list.add("10/11/2021", "11.30am", "3.30pm", "7.30pm","Joseph and the Amazing Technicolor Dreamcoat", 15.00);
//   list.add("11/11/2021", "11.30am", "3.30pm", "7.30pm", "La Boheme", 35.50);

//    public static String getShowList() {
//        return getShowList();
//    }

    public static List<TheatreTemplates> Show = new ArrayList<>(List.of(
            TheNutcracker, AnInspectorCalls, JosephAndTheAmazingTechnicolorDreamcoat, LaBoheme
    ));
}