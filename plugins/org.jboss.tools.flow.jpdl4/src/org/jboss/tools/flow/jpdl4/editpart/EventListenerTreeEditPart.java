package org.jboss.tools.flow.jpdl4.editpart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.jboss.tools.flow.common.wrapper.Wrapper;
import org.jboss.tools.flow.jpdl4.util.SharedImages;

public class EventListenerTreeEditPart extends JpdlTreeEditPart implements ElementTreeEditPart {
	
	public EventListenerTreeEditPart(Wrapper wrapper) {
		super(wrapper);
	}
	
	protected Image getImage() {
		String iconPath = "icons/16/event.gif";
		ImageDescriptor descriptor = ImageDescriptor.createFromURL(
				Platform.getBundle("org.jboss.tools.flow.jpdl4").getEntry(iconPath));
		return SharedImages.INSTANCE.getImage(descriptor);
	}
	
	protected String getText() {
		return "event";
	}
	
}