package freeuni.android.delegator.model;

import java.util.Calendar;
import java.util.List;

public class Task {

	// Public constants


	//Private Variables
	private int taskID;
	private User reporter;
	private boolean assigneeType;
	private List<User> assignees; // Not Used
	private User assignee;
	private Group assigneeGroup;
	private TaskStatus status;
	private int priority=0;
	private Calendar startDate; //Use Date;Calendar;GregorianCalendar
	private Calendar deadLine;
	private int completionPercent=0;
	private String title;
	private String description;
	private List<TaskCategory> categories;
	private List<String> tags;
	private Calendar reminder;
	private String voiceMessagePath; // TODO
	private Work work; 
	private List<Integer> subtaskIDs;
	private List<Comment> commments;


	public Task(){

	}

	/**
	 * @param taskID
	 */
	public Task(int taskID) {
		super();
		this.taskID = taskID;
	}



	/**
	 * @return the assignee
	 */
	public User getAssignee() {
		return assignee;
	}

	/**
	 * @param assignee the assignee to set
	 */
	public void setAssignee(User assignee) {
		if(assignee!=null)
			this.assignee = assignee;
	}

	/**
	 * @return the taskID
	 */
	public int getTaskID() {
		return taskID;
	}

	/**
	 * @return the reporter
	 */
	public User getReporter() {
		return reporter;
	}

	/**
	 * @return the assigneeType
	 */
	public boolean isAssigneeType() {
		return assigneeType;
	}

	/**
	 * @return the assignees
	 */
	public List<User> getAssignees() {
		return assignees;
	}

	/**
	 * @return the assigneeGroup
	 */
	public Group getAssigneeGroup() {
		return assigneeGroup;
	}

	/**
	 * @return the status
	 */
	public TaskStatus getStatus() {
		return status;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return the startDate
	 */
	public Calendar getStartDate() {
		return startDate;
	}

	/**
	 * @return the deadLine
	 */
	public Calendar getDeadLine() {
		return deadLine;
	}

	/**
	 * @return the completionPercent
	 */
	public int getCompletionPercent() {
		return completionPercent;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the categories
	 */
	public List<TaskCategory> getCategories() {
		return categories;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @return the reminder
	 */
	public Calendar getReminder() {
		return reminder;
	}

	/**
	 * @return the voiceMessagePath
	 */
	public String getVoiceMessagePath() {
		return voiceMessagePath;
	}

	/**
	 * @return the work
	 */
	public Work getWork() {
		return work;
	}

	/**
	 * @return the subtaskIDs
	 */
	public List<Integer> getSubtaskIDs() {
		return subtaskIDs;
	}

	/**
	 * @return the commments
	 */
	public List<Comment> getCommments() {
		return commments;
	}

	/**
	 * @param taskID the taskID to set
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	/**
	 * @param reporter the reporter to set
	 */
	public void setReporter(User reporter) {
		if(reporter!=null)
			this.reporter = reporter;
	}

	/**
	 * @param assigneeType the assigneeType to set
	 */
	public void setAssigneeType(boolean assigneeType) {
		this.assigneeType = assigneeType;
	}

	/**
	 * @param assignees the assignees to set
	 */
	public void setAssignees(List<User> assignees) {
		if(assignees!=null)
			this.assignees = assignees;
	}

	/**
	 * @param assigneeGroup the assigneeGroup to set
	 */
	public void setAssigneeGroup(Group assigneeGroup) {
		if(assigneeGroup!=null)
			this.assigneeGroup = assigneeGroup;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(TaskStatus status) {
		if(status!=null)
			this.status = status;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Calendar startDate) {
		if(startDate!=null)
			this.startDate = startDate;
	}

	/**
	 * @param deadLine the deadLine to set
	 */
	public void setDeadLine(Calendar deadLine) {
		if(deadLine!=null)
			this.deadLine = deadLine;
	}

	/**
	 * @param completionPercent the completionPercent to set
	 */
	public void setCompletionPercent(int completionPercent) {
		this.completionPercent = completionPercent;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		if(title!=null)
			this.title = title;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		if(description!=null)
			this.description = description;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<TaskCategory> categories) {
		if(categories!=null)
			this.categories = categories;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		if(tags!=null)
			this.tags = tags;
	}

	/**
	 * @param reminder the reminder to set
	 */
	public void setReminder(Calendar reminder) {
		if(reminder!=null)
			this.reminder = reminder;
	}

	/**
	 * @param voiceMessagePath the voiceMessagePath to set
	 */
	public void setVoiceMessagePath(String voiceMessagePath) {
		if(voiceMessagePath!=null)
			this.voiceMessagePath = voiceMessagePath;
	}

	/**
	 * @param work the work to set
	 */
	public void setWork(Work work) {
		if(work!=null)
			this.work = work;
	}

	/**
	 * @param subtaskIDs the subtaskIDs to set
	 */
	public void setSubtaskIDs(List<Integer> subtaskIDs) {
		if(subtaskIDs!=null)
			this.subtaskIDs = subtaskIDs;
	}

	/**
	 * @param commments the commments to set
	 */
	public void setCommments(List<Comment> commments) {
		if(commments!=null)
			this.commments = commments;
	}

}
