package org.myfly.apps.crm.domain;

/**
 * 
 * Represents a file that a user has uploaded. Unlike Attachment records,
 * documents are not attached to a parent object.
 * 
 * Author AuthorId reference 15 <br>
 * Body Body base64<br>
 * Body Length BodyLength int 8 0<br>
 * Created By CreatedById reference 15<br>
 * Created Date CreatedDate datetime<br>
 * Deleted IsDeleted boolean<br>
 * Description Description textarea 255<br>
 * Document Content Searchable IsBodySearchable boolean<br>
 * Document ID Id id 15<br>
 * Document Name Name string 255<br>
 * Document Unique Name DeveloperName string 80<br>
 * Externally Available IsPublic boolean<br>
 * File Extension Type string 40<br>
 * Folder FolderId reference 15<br>
 * Internal Use Only IsInternalUseOnly boolean<br>
 * Keywords Keywords string 255<br>
 * Last Modified By LastModifiedById reference 15<br>
 * Last Modified Date LastModifiedDate datetime<br>
 * Last Referenced Date LastReferencedDate datetime<br>
 * Last Viewed Date LastViewedDate datetime<br>
 * MIME Type ContentType string 120<br>
 * Namespace Prefix NamespacePrefix string 15<br>
 * System Modstamp SystemModstamp datetime<br>
 * Url Url string 255<br>
 * 
 * @author xiangwanhong
 *
 */
public class Document {
	
}
