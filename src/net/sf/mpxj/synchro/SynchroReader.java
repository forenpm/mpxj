
package net.sf.mpxj.synchro;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import net.sf.mpxj.EventManager;
import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectConfig;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.listener.ProjectListener;
import net.sf.mpxj.reader.AbstractProjectReader;

public final class SynchroReader extends AbstractProjectReader
{
   /**
    * {@inheritDoc}
    */
   @Override public void addProjectListener(ProjectListener listener)
   {
      if (m_projectListeners == null)
      {
         m_projectListeners = new LinkedList<ProjectListener>();
      }
      m_projectListeners.add(listener);
   }

   /**
    * {@inheritDoc}
    */
   @Override public ProjectFile read(InputStream inputStream) throws MPXJException
   {
      try
      {
         SynchroData data = new SynchroData();
         data.process(inputStream);
         return null;
      }

      catch (Exception ex)
      {
         throw new MPXJException(MPXJException.INVALID_FILE, ex);
      }
   }

   private ProjectFile read() throws Exception
   {
      m_project = new ProjectFile();
      m_eventManager = m_project.getEventManager();

      ProjectConfig config = m_project.getProjectConfig();
      config.setAutoCalendarUniqueID(false);
      config.setAutoTaskID(false);
      config.setAutoTaskUniqueID(false);
      config.setAutoResourceUniqueID(false);
      config.setAutoWBS(false);
      config.setAutoOutlineNumber(false);

      m_project.getProjectProperties().setFileApplication("Synchro");
      m_project.getProjectProperties().setFileType("SP");

      m_eventManager.addProjectListeners(m_projectListeners);

      // processProject();
      // processCalendars();
      // processResources();
      // processTasks();
      // processDependencies();
      // processAssignments();

      return m_project;
   }

   private SynchroData m_data;
   private ProjectFile m_project;
   private EventManager m_eventManager;
   private List<ProjectListener> m_projectListeners;
}
