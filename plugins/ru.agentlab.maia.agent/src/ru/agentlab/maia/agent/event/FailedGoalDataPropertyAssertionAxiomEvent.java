package ru.agentlab.maia.agent.event;

import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;

//<<<<<<< HEAD
//import ru.agentlab.maia.Event;
//=======
import ru.agentlab.maia.agent.Event;
//>>>>>>> refs/remotes/origin/feature/#32-beliefbase-centric

public class FailedGoalDataPropertyAssertionAxiomEvent extends Event<OWLDataPropertyAssertionAxiom> {

	public FailedGoalDataPropertyAssertionAxiomEvent(OWLDataPropertyAssertionAxiom payload) {
		super(payload);
	}

}
