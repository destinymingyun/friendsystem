function findAllDiscuss(list) {
    for(var i=0;i<list.length;i++){
        var comment = `                    
               <div class="comment-list">
                <div class="list-item">
                    <div class="span"><span>用户：<a>${list[i].discussId}</a></span></div>
                    <p class="text">${list[i].context}</p>
                </div>
            </div>
            `;
        $("#list").append(comment)
    }
}