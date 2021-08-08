package com.andraea.app.model;

import java.util.ArrayList;
import java.util.List;

public class Show {

    /// Details of the Show
    public static TheatreTemplates TheNutcracker = new TheatreTemplates("21/12/2021", "11.30am", "3.30pm", "7.30pm", "The Nutcracker", 30.99);

    public static TheatreTemplates AnInspectorCalls = new TheatreTemplates("09/09/2021", "1.30pm", "4.30pm", "8.30pm", "An Inspector Calls", 20.99);

    public static TheatreTemplates JosephAndTheAmazingTechnicolorDreamcoat = new TheatreTemplates("10/11/2021", "10.30am", "1.30pm", "7.30pm", "Joseph and the Amazing Technicolor Dreamcoat", 15.99);

    public static TheatreTemplates LaBoheme = new TheatreTemplates("11/11/2021", "12.00pm", "4.00pm", "8.00pm", "La Boheme", 35.99);

    public static List<TheatreTemplates> Show = new ArrayList<>(List.of(
            TheNutcracker, AnInspectorCalls, JosephAndTheAmazingTechnicolorDreamcoat, LaBoheme
    ));
}