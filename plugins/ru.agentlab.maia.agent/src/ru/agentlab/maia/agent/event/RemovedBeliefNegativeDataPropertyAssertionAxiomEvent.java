package ru.agentlab.maia.agent.event;

import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;

//<<<<<<< HEAD
//import ru.agentlab.maia.Event;
//=======
import ru.agentlab.maia.agent.Event;
//>>>>>>> refs/remotes/origin/feature/#32-beliefbase-centric

public class RemovedBeliefNegativeDataPropertyAssertionAxiomEvent extends Event<OWLNegativeDataPropertyAssertionAxiom> {

	public RemovedBeliefNegativeDataPropertyAssertionAxiomEvent(OWLNegativeDataPropertyAssertionAxiom payload) {
		super(payload);
	}

}
