package home.computerlinguistik.commandhandlers;

import java.util.HashMap;
import java.util.Map;

import home.computerlinguistik.lexiconmodel.presentation.LexiconEditorPlugin;
import home.computerlinguistik.lexiconmodel.presentation.LexiconmodelEditor;
import home.computerlinguistik.lexiconmodel.presentation.LexiconmodelModelWizard;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

public class OpenLexiconCommandHandler extends AbstractHandler  {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
perform();
		    return null;
	}

	private void perform() {
		try {
		

		}
		catch (Exception exception) {
			LexiconEditorPlugin.INSTANCE.log(exception);
		}
		
	}

	protected EObject createInitialModel() {
		// TODO Auto-generated method stub
		return null;
	}

	private IFile getModelFile() {
		// TODO Auto-generated method stub
		return null;
	}



}
