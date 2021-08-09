package com.andraea.app.model;

import java.util.List;

public class Show {

    /// Details of the Show
    public static TheatreTemplates TheNutcracker = new TheatreTemplates("21/12/2021", "6pm", "The Nutcracker", 31.99);

    public static TheatreTemplates AnInspectorCalls = new TheatreTemplates("09/09/2021", "7.30pm", "An Inspector Calls", 24.99);

    public static TheatreTemplates Cats = new TheatreTemplates("08/10/2021", "6.30pm", "Cats", 21.99);

    public static TheatreTemplates LaBoheme = new TheatreTemplates("11/11/2021", "8pm", "La Boheme", 29.99);

    public static TheatreTemplates PixarInConcert=  new TheatreTemplates("27/08/2021", "7pm", "Pixar In Concert", 19.99);

    public static List<TheatreTemplates> getAllShows() {
        return List.of(TheNutcracker, AnInspectorCalls, Cats, LaBoheme, PixarInConcert);
    }

}