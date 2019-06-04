// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package pdfparser.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import pdfparser.impl.PdfParser;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Sets the subject of a PDF document. Returns true if successfull.
 */
public class SetSubject extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __inputFile;
	private system.proxies.FileDocument inputFile;
	private java.lang.String subject;

	public SetSubject(IContext context, IMendixObject inputFile, java.lang.String subject)
	{
		super(context);
		this.__inputFile = inputFile;
		this.subject = subject;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.inputFile = __inputFile == null ? null : system.proxies.FileDocument.initialize(getContext(), __inputFile);

		// BEGIN USER CODE
		IContext context = this.context(); 			
		
		if (inputFile != null && inputFile.getHasContents(context)) {
			PdfParser pdfParser = new PdfParser(); 									// Instantiates the PDF parser class
			pdfParser.setSubject(inputFile, context, subject);
			return true;	
		}
		throw new NullPointerException("Empty input file in PDF Parser.");
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetSubject";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
