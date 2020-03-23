function findAllDiscuss(list) {
    for(var i=1;i<list.length;i++){
        var comment = `                    
                <div class="list-item">
                         <div class="span"><span><a>${list[i].discussId}</p></div>
                <div class="content"><p></a></span></div>
                         <p class="text">${list[i].context}</p></div>
                <div class="content"><p></p>
                     </div>
                <hr>
            `
        $(".comment-list").append(comment)
    }
}