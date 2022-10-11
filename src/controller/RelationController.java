package controller;

import data.Human;
import data.Relation;
import data.Relative;
import service.FindRelativeService;

import java.util.List;

public class RelationController {

    private FindRelativeService findRelativeService;

    public RelationController() {
        this.findRelativeService = new FindRelativeService();
    }

    public List<String> findRelations(Human person, List<Relative> relatives) {
        return findRelativeService.findRelatives(person,relatives);
    }

    public Human findPersonByRelations(Human person, Relation relative, List<Relative> relatives) {
        return findRelativeService.findPersonByRelation(person,relative,relatives);
    }
}